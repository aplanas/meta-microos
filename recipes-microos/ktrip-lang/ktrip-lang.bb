SUMMARY = "Translations for package ktrip"
DESCRIPTION = "Provides translations for the 'ktrip' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ktrip-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "4ac21ba56134cc5616b2223ec9e72f057643f9734875d5796610380b6c9d3d535f9e3916ee9970ba4535040b5e8e60bc8292e95e65afddb070c56ebda4a7dccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktrip-lang ktrip-lang-all locale(ktrip:ca) locale(ktrip:ca@valencia) locale(ktrip:cs) locale(ktrip:de) locale(ktrip:en_GB) locale(ktrip:es) locale(ktrip:et) locale(ktrip:fi) locale(ktrip:fr) locale(ktrip:ia) locale(ktrip:it) locale(ktrip:ja) locale(ktrip:ka) locale(ktrip:ko) locale(ktrip:lt) locale(ktrip:nl) locale(ktrip:nn) locale(ktrip:pl) locale(ktrip:pt) locale(ktrip:pt_BR) locale(ktrip:ru) locale(ktrip:sk) locale(ktrip:sl) locale(ktrip:sv) locale(ktrip:tr) locale(ktrip:uk) locale(ktrip:zh_CN) locale(ktrip:zh_TW)"
RDEPENDS:${PN} += "ktrip"

inherit rpm
