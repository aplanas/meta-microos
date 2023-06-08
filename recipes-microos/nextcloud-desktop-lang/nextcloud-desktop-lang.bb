SUMMARY = "Translations for package nextcloud-desktop"
DESCRIPTION = "Provides translations for the 'nextcloud-desktop' package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.1"

RPM_NAME = "nextcloud-desktop-lang-3.8.1-1.1.noarch.rpm"
RPM_HASH = "90f80f2c77da78fad4f6dcb2a5910ee84e2623b40e9316e6e74abfd803a583e06958d265b06aaebeb277a2f397264e3764a16800de072e5d321b0ef8feae1fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nextcloud-desktop-lang nextcloud-desktop-lang-all"
RDEPENDS:${PN} += "nextcloud-desktop"

inherit rpm
