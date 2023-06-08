SUMMARY = "An OBS source service: download files"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This service is parsing all spec files and downloads all Source files which are specified via a http, https or ftp url."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "obs-service-download_files-0.9.2-1.2.noarch.rpm"
RPM_HASH = "cfd297770fe85bdcd9455a52d2c96d12b81ccee6abe669af1214bffdf10ac7e6253aa0e66e8bd744fb14c05060e35d4f136e2cc1054cd2e9a14760f0ae93422b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(obs-service-download_files) obs-service-download_files"
RDEPENDS:${PN} += "/bin/bash build curl diffutils perl(YAML::XS)"

inherit rpm
