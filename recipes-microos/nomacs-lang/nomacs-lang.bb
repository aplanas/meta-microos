SUMMARY = "Translations for package nomacs"
DESCRIPTION = "Provides translations for the 'nomacs' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.16.224"

RPM_NAME = "nomacs-lang-3.16.224-2.22.noarch.rpm"
RPM_HASH = "ab87f230e15786d759fbb04d82636c2462bffddafbd9428aa7ca88f4f84eb48da427fa3d275810124c3df1d4386c7243533a960e784128419fbacf1fc66a61e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nomacs-lang nomacs-lang-all"
RDEPENDS:${PN} += "nomacs"

inherit rpm
