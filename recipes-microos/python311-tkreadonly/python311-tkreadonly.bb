SUMMARY = "A set of Tkinter widgets to display readonly text and code"
DESCRIPTION = "A set of Tkinter widgets to display readonly text and code."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-tkreadonly-0.6.1-2.11.noarch.rpm"
RPM_HASH = "51762145480ab988616aeab4d96c1afd7aba5706230d905cd4de35dfb5323d618801859753f258e4a657e2391839450e607a529631b947f66eec2373fe77c6c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tkreadonly) python311-tkreadonly python3dist(tkreadonly)"
RDEPENDS:${PN} += "python(abi) python311-Pygments python311-idle python311-tk"

inherit rpm
