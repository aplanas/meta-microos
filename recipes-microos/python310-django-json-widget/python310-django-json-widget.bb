SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-django-json-widget-1.1.1-1.4.noarch.rpm"
RPM_HASH = "5ddc07e5a354072181509c4a60449b1ac93dc1f5ee926c05bc4bc06d500da7af67a2c8630c34b5c79c340b3ed48289f3620e37d41f91b7854a061db9411f8a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-json-widget \
python3.10dist(django-json-widget) \
python310-django-json-widget \
python3dist(django-json-widget)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-future"

inherit rpm
