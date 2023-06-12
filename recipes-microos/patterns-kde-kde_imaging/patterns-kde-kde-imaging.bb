SUMMARY = "KDE Graphics"
DESCRIPTION = "KDE Applicatons - Handling of digital photos and graphics"
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_imaging-20230403-1.1.noarch.rpm"
RPM_HASH = "5105c1dfc86ab1f23052ad1711734ac28b8953e4220738e7fabba8dab7a09745129e2f8bbacb7e2114689cf9d349b9034940e2509675e7871b51b34f09f41b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-kde-kde_imaging \
patterns-openSUSE-kde4_imaging \
patterns-openSUSE-kde_imaging"
RDEPENDS:${PN} += "pattern()"

inherit rpm
