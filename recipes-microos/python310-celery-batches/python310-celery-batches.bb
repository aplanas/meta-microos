SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python310-celery-batches-0.7-1.2.noarch.rpm"
RPM_HASH = "18239b14d86b84dc145dc45263e87c6b7f396b1762cc76f7440effdf391b47c5feb0524ef2e8721891ac54e39da01239f3385d9b52447b1316f85549d88712e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-celery-batches \
python3.10dist(celery-batches) \
python310-celery-batches \
python3dist(celery-batches)"
RDEPENDS:${PN} += "python(abi) \
python310-celery"

inherit rpm
