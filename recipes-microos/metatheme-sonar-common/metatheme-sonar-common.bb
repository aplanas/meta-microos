SUMMARY = "GTK+, Xfwm4 and Metacity Sonar Theme -- Common Files"
DESCRIPTION = "GTK+, Xfwm4 and Metacity theme created for openSUSE 11.2."
LICENSE = "GPL-2.0-or-later"

PV = "11.3.0"

RPM_NAME = "metatheme-sonar-common-11.3.0-30.17.noarch.rpm"
RPM_HASH = "457254f0cf4496acf66e8e8f1a7a4be589cdcfc8cda527aecbd546a7d82aeaaf4f3664690251f51fdc8d67481292a613239e0347cae912fd32be522311d813f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-sonar-common"
RDEPENDS:${PN} += ""

inherit rpm
