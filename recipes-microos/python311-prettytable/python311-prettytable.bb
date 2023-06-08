SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python311-prettytable-3.7.0-1.1.noarch.rpm"
RPM_HASH = "3a269976098c6100b32291d7a7e53cdfb38686ae8e6dcba60fafc13b10ad8119f7e499f71a97fb6da4b8d49b0c27fc26ac28b7dfefad03ebf642faa8be6b90fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(prettytable) python311-PrettyTable python311-prettytable python3dist(prettytable)"
RDEPENDS:${PN} += "python(abi) python311-wcwidth"

inherit rpm
