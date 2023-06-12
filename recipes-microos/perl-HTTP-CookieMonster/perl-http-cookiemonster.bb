SUMMARY = "Easy read/write access to your jar of HTTP::Cookies"
DESCRIPTION = "This module was created because messing around with HTTP::Cookies is \
non-trivial. HTTP::Cookies a very useful module, but using it is not always \
as easy and clean as it could be. For instance, if you want to find a \
particular cookie, you can't just ask for it by name."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-HTTP-CookieMonster-0.11-1.10.noarch.rpm"
RPM_HASH = "b00c39d9c74f31378a61da34e6bd427e6774f24ade739fc53a9b9c2aca096d115216a3d1cd22fa2f223588a383b32338ab3e7c6a46e2578fcbb1e420d32f69c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::CookieMonster) \
perl(HTTP::CookieMonster::Cookie) \
perl-HTTP-CookieMonster"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(HTTP::Cookies) \
perl(Moo) \
perl(Safe::Isa) \
perl(Sub::Exporter) \
perl(URI::Escape)"

inherit rpm
