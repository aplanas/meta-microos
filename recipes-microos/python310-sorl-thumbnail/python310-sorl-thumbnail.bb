SUMMARY = "Thumbnails for Django"
DESCRIPTION = "Thumbnails for Django. \
 \
Features at a glance \
--------------------- \
- Storage support \
- Pluggable Engine support (PIL, pgmagick) \
- Pluggable Key Value Store support (redis, cached db) \
- Pluggable Backend support \
- Admin integration with possibility to delete \
- Dummy generation \
- Flexible, simple syntax, generates no html \
- ImageField for model that deletes thumbnails \
- CSS style cropping options \
- Margin calculation for vertical positioning"
LICENSE = "BSD-3-Clause"

PV = "12.7.0"

RPM_NAME = "python310-sorl-thumbnail-12.7.0-6.3.noarch.rpm"
RPM_HASH = "5afc3224b9e3f5eceaed748478c970eee6e1f42e406c448d03a34378af0b1ad388af839fb1f515d17cf874533ed43ac0d5b835898c3b4d143ca688cf4b2d4bcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sorl-thumbnail \
python3.10dist(sorl-thumbnail) \
python310-sorl-thumbnail \
python3dist(sorl-thumbnail)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
