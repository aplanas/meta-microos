SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python310-bytecode-0.14.1-1.1.noarch.rpm"
RPM_HASH = "2c081991939090f9ea7f7dbc80df588d304211fda01b7db24bf8993543fc2628b8397ad5061095381b75c6cc515d260d6a4f2d506b6bcb2aa18a51c3cc8373d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bytecode python3.10dist(bytecode) python310-bytecode python3dist(bytecode)"
RDEPENDS:${PN} += "(python310-typing-extensions if python310-base < 3.10) python(abi)"

inherit rpm
