SUMMARY = "An OBS source service: Recompress files"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports to compress, uncompress or recompress files from or to \
 \
 none : No Compression \
 gz   : Gzip Compression \
 bz2  : Bzip2 Compression \
 xz   : XZ Compression \
 zstd : Zstd Compression"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "obs-service-recompress-0.5.2-1.5.noarch.rpm"
RPM_HASH = "95801cadfe41a508569ee23321ebf7ce5a374dfbd24ad12a4e2b5ecbaed5b871b39754903903968e72564e4bcbd930420a621b2b5342dff87a27e9f88a1de358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-recompress"
RDEPENDS:${PN} += "/bin/bash /usr/bin/gzip bzip2 xz zstd"

inherit rpm
