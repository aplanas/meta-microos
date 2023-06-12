SUMMARY = "A pure Python Lex/Yacc that works with RPython"
DESCRIPTION = "RPLY is a pure Python parser generator that also works with RPython. \
It is a more-or-less direct port of David Beazley's PLY, with a new \
public API, and with RPython support."
LICENSE = "BSD-3-Clause"

PV = "0.7.8"

RPM_NAME = "python311-rply-0.7.8-2.3.noarch.rpm"
RPM_HASH = "90938a5cd5a3924a21479eb9eda83c729d8a6fa88ae4f5fe9a9982c47bf82ea7e84fb4206ac60ac8bf619135ef3a8fee124494dbb8b3fe4ab0b937f039b7800c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rply) \
python311-rply \
python3dist(rply)"
RDEPENDS:${PN} += "python(abi) \
python311-appdirs"

inherit rpm
