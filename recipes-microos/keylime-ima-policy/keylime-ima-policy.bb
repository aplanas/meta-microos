SUMMARY = "IMA policy for Keylime agent"
DESCRIPTION = "Subpackage of rust-keylime to provide an suggested IMA policy for Keylime agent"
LICENSE = "Apache-2.0 & MIT"

PV = "0.2.1+git.1682587333.b497f1d"

RPM_NAME = "keylime-ima-policy-0.2.1+git.1682587333.b497f1d-1.1.aarch64.rpm"
RPM_HASH = "084ab4a039fbc50d6a1b5e6c5335fed2295551742eb2203153f0e2665ee1a53dc33886c5f1a90b776ac17606b7187714d1ca9f624354f44f8a6993d275673600"

RPROVIDES:${PN} += "config(keylime-ima-policy) keylime-ima-policy keylime-ima-policy(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
