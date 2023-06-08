SUMMARY = "The base dictionary of KAKASI"
DESCRIPTION = "The base dictionary of KAKASI"
LICENSE = "GPL-2.0+"

PV = "2.3.6"

RPM_NAME = "kakasi-dict-2.3.6-3.32.aarch64.rpm"
RPM_HASH = "3299a6ad3c34c0924b84f364fc24e803ace6e1f8f961d9a205b6e6b067fb38bdca3a2f17890be6a6add48d82d520cc8dbf0cea92359ff90a8e15972f667f820c"

RPROVIDES:${PN} += "kakasi-dict kakasi-dict(aarch-64) kakasidi"
RDEPENDS:${PN} += ""

inherit rpm
