SUMMARY = "Python tool to dump binary data"
DESCRIPTION = "This utility converts between the raw representation and a \
byte-based hexdump representation. \
 \
The display is equivalent to the output of the `hexdump -C` command, but \
it requires a Python runtime."
LICENSE = "Unlicense"

PV = "3.3"

RPM_NAME = "python310-hexdump-3.3-3.3.noarch.rpm"
RPM_HASH = "f53a88ad82cb3f4d6a9b34af0340d3883609ad4cc2b7d4ca99d74e46fe3d74158ffaaaf3e495eac7aed3e8c48b52090c866c56cfe17378167e18cf6191642eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hexdump python3.10dist(hexdump) python310-hexdump python3dist(hexdump)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
