SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python39-prettytable-3.7.0-1.1.noarch.rpm"
RPM_HASH = "c87c5bddb031ba6657d719a3815c4531c4aa6c8e816ce6a203631bbb65854436890fd96ebd23fcdbc390c77841ce1036301d31531fa3e434a202ee94905b59c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(prettytable) \
python39-PrettyTable \
python39-prettytable \
python3dist(prettytable)"
RDEPENDS:${PN} += "python(abi) \
python39-wcwidth"

inherit rpm
