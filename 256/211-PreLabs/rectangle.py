import base64

class Rectangle(object):
    def __init__(self, length: float, width: float):
        self.length = length
        self.width = width

    # don't need those annoying getters / setters :D

    def obj_reference(self) -> str:
        # formatted to be similar to Java
        return f"Rectangle@{hex(id(self))}"

    def generate_hash(self) -> str:
        ref: str = self.obj_reference() + ".password"
        encode_b = base64.b64encode(ref.encode("utf-8"))
        return encode_b.decode("utf-8")

    def decode_hash(self, code: str) -> str:
        decode_b = base64.b64decode(code.encode("utf-8"))
        return decode_b.decode("utf-8")