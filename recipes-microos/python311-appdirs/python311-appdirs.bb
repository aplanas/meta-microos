SUMMARY = "A small Python module for determining platform-specific dirs"
DESCRIPTION = "``appdirs`` will \
help you choose an appropriate: \
 \
- user data dir (``user_data_dir``) \
- user cache dir (``user_cache_dir``) \
- site data dir (``site_data_dir``) \
- user log dir (``user_log_dir``)"
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python311-appdirs-1.4.4-4.1.noarch.rpm"
RPM_HASH = "f351c2334964b27141c6177649a51fc3d99941c175a6e3aa86a858b85dfd6fabf824c91f78f46ed6567d763e2902b14791d0cc0ac08a3dd251fa7a9193189fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(appdirs) python311-appdirs python3dist(appdirs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
