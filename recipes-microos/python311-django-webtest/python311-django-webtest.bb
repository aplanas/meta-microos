SUMMARY = "Django integration for WebTest"
DESCRIPTION = "Instant integration of Ian Bicking's WebTest with django's testing framework."
LICENSE = "MIT"

PV = "1.9.10"

RPM_NAME = "python311-django-webtest-1.9.10-1.4.aarch64.rpm"
RPM_HASH = "086d7362fed14d930ee46f5fbaf0b1350fb649e20bf2117231f8c09f151f2819bed9282c57120f4d1d2b59417f6ec58da5b47ad9909ec5ae5ccb63caad3e1a84"

RPROVIDES:${PN} += "python3.11dist(django-webtest) python311-django-webtest python311-django-webtest(aarch-64) python3dist(django-webtest)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-WebTest"

inherit rpm
