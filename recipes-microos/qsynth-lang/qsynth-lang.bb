SUMMARY = "Translations for package qsynth"
DESCRIPTION = "Provides translations for the 'qsynth' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.10"

RPM_NAME = "qsynth-lang-0.9.10-1.1.noarch.rpm"
RPM_HASH = "eb772ad77fff4d52576516a94d55660e273687a51e04e8fac195da19f894a57f0e5686fde6a011067fd59c84819464af17ebe448f5f199df65bc0f866a4642a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qsynth-lang \
qsynth-lang-all"
RDEPENDS:${PN} += "qsynth"

inherit rpm
