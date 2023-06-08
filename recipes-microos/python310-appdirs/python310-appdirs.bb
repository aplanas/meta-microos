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

RPM_NAME = "python310-appdirs-1.4.4-4.1.noarch.rpm"
RPM_HASH = "2a52b69b1084ce1a44ac92a55c6b9b3ac65c1090daba83d77051cc3adbbf24f5e510b34187be802ac7694607371df48767689a4fe5ef50cc659fd4b9c28bfd53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-appdirs python3.10dist(appdirs) python310-appdirs python3dist(appdirs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
