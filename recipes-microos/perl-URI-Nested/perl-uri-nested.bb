SUMMARY = "Nested URIs"
DESCRIPTION = "Nested URIs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-URI-Nested-0.10-1.22.noarch.rpm"
RPM_HASH = "a6c7bdb7cfe012633d26cfc3134c6b3c76b7c2f6151b8fc9fcb5919f4702a66f3c6945f8b94ad5a439dfa27ae2c7bbbda7f47e7511d064f29d5b818aad5db2a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(URI::Nested) \
perl-URI-Nested"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(URI)"

inherit rpm
