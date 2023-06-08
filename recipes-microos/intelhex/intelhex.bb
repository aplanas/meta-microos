SUMMARY = "Library for Intel HEX Files Manipulations"
DESCRIPTION = "Python implementation of Intel HEX file format allows you read, modify, write \
hex files and convert them to binary form. \
 \
The Intel HEX file format widely used in microprocessors and microcontrollers \
area as the de-facto standard for representation of code for programming \
microelectronic devices. \
 \
This work implements an **intelhex** Python library to read, write, \
create from scratch and manipulate data from HEX (also known as Intel HEX) \
file format. These operations are provided by “IntelHex” class. \
 \
The distribution package also includes several convenience Python scripts \
to do basic tasks that utilize this library. The “bin2hex.py” script \
converts binary data to HEX, and the “hex2bin.py” works the other direction. \
“hex2dump.py” converts data from HEX to a hexdump which is useful for \
inspecting data, and “hexmerge.py” merges multiple HEX files into one."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "intelhex-2.3.0-1.3.noarch.rpm"
RPM_HASH = "746b7b3aace52300532e0c93504b5dad8a118f17492fcea447fce3d2614cca2bc7746f7d0d25cbd1254eec0b94a6cd5475b075a6b7062b71a7fa9c20b70f6af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intelhex python3.10dist(intelhex) python3dist(intelhex)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi)"

inherit rpm
