SUMMARY = "Plack::Middleware which removes body for HTTP response if it's not required"
DESCRIPTION = "This module removes body in HTTP response, if it's not required."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Plack-Middleware-RemoveRedundantBody-0.09-1.12.noarch.rpm"
RPM_HASH = "adf2614fbcd76b63219c13da06e36831bbf3dd0ea288e49ada9fb09746c9cfd36ffe5b6c09fc70a19efca412b44c88cac44d00fd72b9ca351de3be33f3e337e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Plack::Middleware::RemoveRedundantBody) \
perl-Plack-Middleware-RemoveRedundantBody"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Plack::Middleware) \
perl(Plack::Util) \
perl(parent)"

inherit rpm
