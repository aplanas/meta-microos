SUMMARY = "Translations for package qalculate-gtk"
DESCRIPTION = "Provides translations for the 'qalculate-gtk' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "qalculate-gtk-lang-4.6.1-1.1.noarch.rpm"
RPM_HASH = "7224bf0df12726d247cea094a86c54d84b184ee7fdbc60f8a99268086e26682e9afd7cff4d361c2b2219df025dbf1b5ad841ee2c99f8774d62e26b6fc13f2b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(qalculate-gtk:ca) locale(qalculate-gtk:de) locale(qalculate-gtk:es) locale(qalculate-gtk:fr) locale(qalculate-gtk:nl) locale(qalculate-gtk:pt_BR) locale(qalculate-gtk:ru) locale(qalculate-gtk:sl) locale(qalculate-gtk:sv) locale(qalculate-gtk:zh_CN) qalculate-gtk-lang qalculate-gtk-lang-all"
RDEPENDS:${PN} += "qalculate-gtk"

inherit rpm
