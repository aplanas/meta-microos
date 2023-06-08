SUMMARY = "AngularJS library 'schema-form' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.8.13.0"

RPM_NAME = "python311-XStatic-Angular-Schema-Form-0.8.13.0-2.15.noarch.rpm"
RPM_HASH = "a0c8a4916b1c2d2daa6886f8884db856c0050c6a1efd04a29f7ef2684bc9d28560eac742dfde4bb34f35d6db305fd22b38ae25377fc89690b83c322a0d47a1bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xstatic-angular-schema-form) python311-XStatic-Angular-Schema-Form python3dist(xstatic-angular-schema-form)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
