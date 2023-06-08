SUMMARY = "Python tool to dump binary data"
DESCRIPTION = "This utility converts between the raw representation and a \
byte-based hexdump representation. \
 \
The display is equivalent to the output of the `hexdump -C` command, but \
it requires a Python runtime."
LICENSE = "Unlicense"

PV = "3.3"

RPM_NAME = "python39-hexdump-3.3-3.3.noarch.rpm"
RPM_HASH = "4bf0e667918260f89bf139e25eb07f6f06b73db5ddaec9a4b34d4b2a5e8dd617f24fba229dfec35924bf51a4a3b61a82fac5f4f2fa208e4356a279cba6359c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hexdump) python39-hexdump python3dist(hexdump)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
