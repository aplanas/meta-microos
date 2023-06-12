SUMMARY = "A KeePass plugin for Have I been pwned"
DESCRIPTION = "A Keepass plugin that performs offline and online checks against HaveIBeenPwned passwords. \
Check can be performed both during password generation and editing or in batch over the whole \
database."
LICENSE = "GPL-3.0-only"

PV = "1.7.10"

RPM_NAME = "keepass-plugin-HIBPOfflineCheck-1.7.10-1.1.noarch.rpm"
RPM_HASH = "2a4019b6dc66e59dbac5f5c947caf6ba3120a0f0df188810fe476bed2f7f295e7b401a32aaaca25ddddc981aad93a44ecea6b2406f4c768e7e0c0c0800ccc281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepass-plugin-HIBPOfflineCheck mono(HIBPOfflineCheck)"
RDEPENDS:${PN} += "keepass mono(KeePass) mono(System) mono(System.Drawing) mono(System.Windows.Forms) mono(mscorlib)"

inherit rpm
