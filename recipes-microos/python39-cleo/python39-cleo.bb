SUMMARY = "Python module for creating testable command-line interfaces"
DESCRIPTION = "Cleo allows you to create beautiful and testable command-line interfaces."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-cleo-2.0.1-2.1.noarch.rpm"
RPM_HASH = "4a5334d96ef47e9fafaf190165dbe56c65b269f3d523a4ad61d0867a82e6f7a0d2c2b62b6eb04a7af274c7a10272c44bde00d3e2f2ff84fb02f4ef52e742dc0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cleo) python39-cleo python3dist(cleo)"
RDEPENDS:${PN} += "python(abi) python39-crashtest python39-pylev python39-rapidfuzz"

inherit rpm
