SUMMARY = "Django package to send push notifications to mobile devices"
DESCRIPTION = "Send push notifications to mobile devices through GCM, APNS or WNS and \
to WebPush (Chrome, Firefox and Opera) in Django."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-django-push-notifications-3.0.0-2.4.noarch.rpm"
RPM_HASH = "ea7af1d463474d034414788fa7004e0df323b0ac0ad21df462be9f1980b71dfc6a5952997ba4dbe33beb270a523880aea1f01e49fb2d67fa0050391445128249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-push-notifications) python311-django-push-notifications python3dist(django-push-notifications)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-pywebpush"

inherit rpm
