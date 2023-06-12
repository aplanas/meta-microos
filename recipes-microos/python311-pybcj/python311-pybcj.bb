SUMMARY = "A bcj filter library"
DESCRIPTION = "In data compression, BCJ, short for Branch-Call-Jump, refers to a technique that \
improves the compression of machine code of executable binaries by replacing \
relative branch addresses with absolute ones. This allows a LZMA compressor to \
identify duplicate targets and archive higher compression rate. \
 \
BCJ is used in 7-zip compression utility as default filter for executable binaries. \
 \
pybcj is a python bindings with BCJ implementation by C language. The C codes are \
derived from p7zip, portable 7-zip implementation. pybcj support Intel/Amd \
x86/x86_64, Arm/Arm64, ArmThumb, Sparc, PPC, and IA64."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "python311-pybcj-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "1cb4f09d6ad3c99fed06c0e8728c021c8960973fe0394be37c3970200ac619602ccbf4270d9c140c0742e4a6b1ace427fa5da5023ee1f94c45053391edcbc68d"

RPROVIDES:${PN} += "python3.11dist(pybcj) \
python311-pybcj \
python311-pybcj(aarch-64) \
python3dist(pybcj)"
RDEPENDS:${PN} += "(python311-importlib_metadata if python311-base < 3.8) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
