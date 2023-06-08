SUMMARY = "A KeePass plugin for Have I been pwned"
DESCRIPTION = "A Keepass plugin that performs offline and online checks against HaveIBeenPwned passwords. \
Check can be performed both during password generation and editing or in batch over the whole \
database."
LICENSE = "GPL-3.0-only"

PV = "1.7.9"

RPM_NAME = "keepass-plugin-HIBPOfflineCheck-1.7.9-1.5.noarch.rpm"
RPM_HASH = "7956814c39d25b839afa281ff1c8f524fd59097bb218018ecd5178d635eb6d6c924f483b451673ef496b9a00916ed6309d93d5155a21803a4497ea3e1e40553c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepass-plugin-HIBPOfflineCheck mono(HIBPOfflineCheck)"
RDEPENDS:${PN} += "keepass mono(KeePass) mono(System) mono(System.Drawing) mono(System.Windows.Forms) mono(mscorlib)"

inherit rpm
