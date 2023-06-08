SUMMARY = "Translations for package plasma5-disks"
DESCRIPTION = "Provides translations for the 'plasma5-disks' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "plasma5-disks-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "38b6f69cb4c7b8c9716be8670292315e6926a38f3b83a80d28fcf95607051b3e8e99119e54b0a865fca05c99a5463330580e2bf3837a5844ca47c2bdb8b24f6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-disks:az) locale(plasma5-disks:bg) locale(plasma5-disks:ca) locale(plasma5-disks:ca@valencia) locale(plasma5-disks:cs) locale(plasma5-disks:da) locale(plasma5-disks:de) locale(plasma5-disks:el) locale(plasma5-disks:en_GB) locale(plasma5-disks:es) locale(plasma5-disks:et) locale(plasma5-disks:eu) locale(plasma5-disks:fi) locale(plasma5-disks:fr) locale(plasma5-disks:hu) locale(plasma5-disks:ia) locale(plasma5-disks:id) locale(plasma5-disks:is) locale(plasma5-disks:it) locale(plasma5-disks:ka) locale(plasma5-disks:ko) locale(plasma5-disks:nl) locale(plasma5-disks:nn) locale(plasma5-disks:pa) locale(plasma5-disks:pl) locale(plasma5-disks:pt) locale(plasma5-disks:pt_BR) locale(plasma5-disks:ro) locale(plasma5-disks:ru) locale(plasma5-disks:sk) locale(plasma5-disks:sl) locale(plasma5-disks:sv) locale(plasma5-disks:tr) locale(plasma5-disks:uk) locale(plasma5-disks:zh_CN) plasma5-disks-lang plasma5-disks-lang-all"
RDEPENDS:${PN} += "plasma5-disks"

inherit rpm
