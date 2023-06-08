SUMMARY = "OpenID Connect Provider implementation for Django"
DESCRIPTION = "OpenID Connect Provider implementation for Django."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-django-oidc-provider-0.7.0-3.4.noarch.rpm"
RPM_HASH = "c5226b7b87a6d82f9eaef4342da00afbc0e619dd8afc0f40883c74c40b3e5588aed264d897437f1215ecc8be8cb29b88fc456cd6ca4b0e03cb7f3115e0e6434d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-oidc-provider) python311-django-oidc-provider python3dist(django-oidc-provider)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-pyjwkest"

inherit rpm
