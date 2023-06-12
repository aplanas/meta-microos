SUMMARY = "Data files for the libpinyin IME"
DESCRIPTION = "libpinyin is an intelligent (and universal) sentence-based Pinyin IME \
backend supporting many language models and frontends. \
 \
This package provides language model table data for libpinyin."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libpinyin-data-2.8.1-1.3.aarch64.rpm"
RPM_HASH = "91d9b4e2074b21fd86db39d17844d78a16c91b31c22322b295494458e4077d2197ec835724bda600e1ff043baddb5816984fbc984c9ed18f5a179fd2ab8db941"

RPROVIDES:${PN} += "libpinyin-data \
libpinyin-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
