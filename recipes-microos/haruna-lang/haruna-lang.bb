SUMMARY = "Translations for package haruna"
DESCRIPTION = "Provides translations for the 'haruna' package."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later & WTFPL"

PV = "0.10.3"

RPM_NAME = "haruna-lang-0.10.3-1.5.noarch.rpm"
RPM_HASH = "f0caa47b4ec0c6e9e533166ee69bd67851b450c518abe80a6def3e066932349ec3bb64b47423bde20233e5085c7f42f13e9cfd95f8ba877feca2ef74a04c69cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "haruna-lang haruna-lang-all locale(haruna:ar) locale(haruna:ca) locale(haruna:ca@valencia) locale(haruna:cs) locale(haruna:de) locale(haruna:en_GB) locale(haruna:es) locale(haruna:eu) locale(haruna:fi) locale(haruna:fr) locale(haruna:hi) locale(haruna:id) locale(haruna:it) locale(haruna:ka) locale(haruna:ko) locale(haruna:nl) locale(haruna:pl) locale(haruna:pt) locale(haruna:pt_BR) locale(haruna:ru) locale(haruna:sk) locale(haruna:sl) locale(haruna:sv) locale(haruna:ta) locale(haruna:tr) locale(haruna:uk) locale(haruna:zh_CN)"
RDEPENDS:${PN} += "haruna"

inherit rpm
