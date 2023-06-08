SUMMARY = "Expand crontab(5)-style integer lists"
DESCRIPTION = "Set::Crontab parses crontab-style lists of integers and defines some \
utility functions to make it easier to deal with them. \
 \
 \
 \
Authors: \
-------- \
    Abhijit Menon-Sen <ams@wiw.org>"
LICENSE = "Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-Set-Crontab-1.03-20.29.aarch64.rpm"
RPM_HASH = "70ed9bd9aedecf8f65a04ff0125906e1c336444944c0e8047eb92d5e9c2229bcc6c343b2033f4fa22f0b0a4f47c6d957f87265b7ea08b68f3d1e5b62c9f1ffda"

RPROVIDES:${PN} += "perl(Set::Crontab) perl-Set-Crontab perl-Set-Crontab(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
