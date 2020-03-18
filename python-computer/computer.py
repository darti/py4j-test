from py4j.java_gateway import JavaGateway, CallbackServerParameters


class PythonComputer(object):

    def sayHello(self, name: str):
        return f'Hello {name}'

    class Java:
        implements = ["com.dartiguenave.experiments.py4j.PythonComputer"]


if __name__ == '__main__':
    computer = PythonComputer()

    gateway = JavaGateway(
        callback_server_parameters=CallbackServerParameters(),
        python_server_entry_point=computer)
