SUMMARY = "Database of Processor Instructions/Opcodes"
DESCRIPTION = "The goal of this project is to document instruction sets in a format convenient \
for tools development. An instruction set is represented by three files: \
 \
- An XML file that describes instructions \
- An XSD file that describes the structure of the XML file \
- A Python module that reads the XML file and represents it as a set of Python \
  objects \
 \
This project is a spin-off from <https://github.com/Maratyszcza/PeachPy"
LICENSE = "BSD-2-Clause"

PV = "0.3.14"

RPM_NAME = "python311-opcodes-0.3.14-2.13.noarch.rpm"
RPM_HASH = "7670ef527c4a6f80403fd3d19fc3be6b6dfde3c6dd450ff2dbbf161a363c13e22eeba392c550be53174122fd3d779a13e880b6410f1a93e2c54bf1717f4b2a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(opcodes) python311-opcodes python3dist(opcodes)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
