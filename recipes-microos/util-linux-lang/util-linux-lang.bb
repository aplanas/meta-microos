SUMMARY = "Translations for package util-linux"
DESCRIPTION = "Provides translations for the 'util-linux' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "util-linux-lang-2.38.1-12.1.noarch.rpm"
RPM_HASH = "a59457e9ca4e632b3e61432bd81f8426e98193551b364f89a66cc46ab32db28ff03319a6676e6335c71bcdd591a7c7620a9bcd28907a7d7c9f76e96aa3587e3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(util-linux:ca) locale(util-linux:cs) locale(util-linux:da) locale(util-linux:de) locale(util-linux:es) locale(util-linux:et) locale(util-linux:eu) locale(util-linux:fi) locale(util-linux:fr) locale(util-linux:gl) locale(util-linux:hr) locale(util-linux:hu) locale(util-linux:id) locale(util-linux:it) locale(util-linux:ja) locale(util-linux:nl) locale(util-linux:pl) locale(util-linux:pt) locale(util-linux:pt_BR) locale(util-linux:ru) locale(util-linux:sl) locale(util-linux:sv) locale(util-linux:tr) locale(util-linux:uk) locale(util-linux:vi) locale(util-linux:zh_CN) locale(util-linux:zh_TW) util-linux-lang util-linux-lang-all"
RDEPENDS:${PN} += "util-linux"

inherit rpm
