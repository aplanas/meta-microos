SUMMARY = "A malware identification and classification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.0"

RPM_NAME = "yara-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "476193039889983818bd27735d0c503f736f00905cdc4db74a62e1d0cd150f73533a98b5ac0ea907f921c709192d0ff0c5adb346e3ab8857b8166fc38ee6f7b2"

RPROVIDES:${PN} += "yara yara(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libyara.so.10()(64bit)"

inherit rpm
