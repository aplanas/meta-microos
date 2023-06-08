SUMMARY = "Django admin CKEditor integration"
DESCRIPTION = "Django admin CKEditor integration. Provides a RichTextField and \
CKEditorWidget utilizing CKEditor with image upload and browsing \
support included."
LICENSE = "BSD-3-Clause"

PV = "6.5.1"

RPM_NAME = "python310-django-ckeditor-6.5.1-1.3.noarch.rpm"
RPM_HASH = "7387dc53b38e260086689c15eca146b745b175eebc3e486e76d4bbe3ab9b84227ba024aca0fad8912b6650d574121f683db83671c9be92b25394cdfd1e6d0854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-ckeditor python3.10dist(django-ckeditor) python310-django-ckeditor python3dist(django-ckeditor)"
RDEPENDS:${PN} += "python(abi) python310-Pillow python310-django-js-asset"

inherit rpm
