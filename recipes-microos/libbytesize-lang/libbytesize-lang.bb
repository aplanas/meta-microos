SUMMARY = "Translations for package libbytesize"
DESCRIPTION = "Provides translations for the 'libbytesize' package."
LICENSE = "LGPL-2.1-only"

PV = "2.8"

RPM_NAME = "libbytesize-lang-2.8-1.1.noarch.rpm"
RPM_HASH = "a5e4184885e8731b7bd830213f369334a60a57e898dd9d5b496b64d5b41fc431fec6170aa79144222baf631b7e5ed05b0df5e08068fbef8fb2803969660c40b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbytesize-lang libbytesize-lang-all locale(libbytesize:ast) locale(libbytesize:be) locale(libbytesize:bn_IN) locale(libbytesize:ca) locale(libbytesize:cs) locale(libbytesize:da) locale(libbytesize:de) locale(libbytesize:es) locale(libbytesize:fi) locale(libbytesize:fr) locale(libbytesize:fur) locale(libbytesize:he) locale(libbytesize:hr) locale(libbytesize:hu) locale(libbytesize:id) locale(libbytesize:it) locale(libbytesize:ka) locale(libbytesize:kk) locale(libbytesize:ko) locale(libbytesize:nl) locale(libbytesize:nn) locale(libbytesize:pl) locale(libbytesize:pt) locale(libbytesize:pt_BR) locale(libbytesize:ru) locale(libbytesize:si) locale(libbytesize:sk) locale(libbytesize:sq) locale(libbytesize:sv) locale(libbytesize:tr) locale(libbytesize:uk) locale(libbytesize:zh_CN) locale(libbytesize:zh_TW)"
RDEPENDS:${PN} += "libbytesize"

inherit rpm
