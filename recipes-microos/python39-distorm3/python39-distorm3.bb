SUMMARY = "Disassembler Library For x86/AMD64"
DESCRIPTION = "diStorm3 is a decomposer, which means it takes an instruction and \
returns a binary structure which describes it rather than static \
text."
LICENSE = "BSD-3-Clause"

PV = "3.5.2"

RPM_NAME = "python39-distorm3-3.5.2-1.11.aarch64.rpm"
RPM_HASH = "786caba1b8cb903bc783a76a405ec287d7a86423ea7a73ca0e77fd343116bbec59d7538bc531ad0ae72cd0a554ca80299002265d26ebb8305ce8ca4fb9cf2913"

RPROVIDES:${PN} += "python3.9dist(distorm3) \
python39-distorm3 \
python39-distorm3(aarch-64) \
python3dist(distorm3)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
