SUMMARY = "Translations for package net6"
DESCRIPTION = "Provides translations for the 'net6' package."
LICENSE = "LGPL-2.1+"

PV = "1.3.14"

RPM_NAME = "net6-lang-1.3.14-12.26.noarch.rpm"
RPM_HASH = "832a435bd2d60843816bcb3653a83ecf97c179abe70d330eb6446339a095a05b0898ca165f42f3b89e4be639a972dea507c40a4c986a811a4d5a89449487f741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(net6:ast) locale(net6:de) locale(net6:en_GB) locale(net6:es) locale(net6:fr) locale(net6:he) locale(net6:it) locale(net6:ko) locale(net6:nb) locale(net6:nl) locale(net6:pt) locale(net6:pt_BR) locale(net6:ru) locale(net6:sk) locale(net6:sv) locale(net6:uk) locale(net6:zh_CN) net6-lang net6-lang-all"
RDEPENDS:${PN} += "net6"

inherit rpm
