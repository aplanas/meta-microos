SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python39-bytecode-0.14.1-1.1.noarch.rpm"
RPM_HASH = "cd22c7f0b35abd590d054cf75fca0ed588288d1c7783d64c7fbf48d6226ab07bd734a94fc1d226fc0bf962e8b6ee2826d9578789417ce420c1846bf35f4da9b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bytecode) python39-bytecode python3dist(bytecode)"
RDEPENDS:${PN} += "(python39-typing-extensions if python39-base < 3.10) python(abi)"

inherit rpm
