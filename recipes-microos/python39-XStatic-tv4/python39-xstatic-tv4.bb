SUMMARY = "AngularJS library 'tv4' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.7.0"

RPM_NAME = "python39-XStatic-tv4-1.2.7.0-1.15.noarch.rpm"
RPM_HASH = "73b92006c19e38503aa3195d7e7135edcb509b2565f1276347631f47652d19e663e3070fa5d986041e619bb8073a619eb7f6783cdb18a5de1b72531076230a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xstatic-tv4) \
python39-XStatic-tv4 \
python3dist(xstatic-tv4)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
