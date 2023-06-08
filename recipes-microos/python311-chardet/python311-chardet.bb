SUMMARY = "Universal encoding detector"
DESCRIPTION = "Universal character encoding detector \
------------------------------------- \
 \
Detects \
 - ASCII, UTF-8, UTF-16 (2 variants), UTF-32 (4 variants) \
 - Big5, GB2312, EUC-TW, HZ-GB-2312, ISO-2022-CN (Traditional and Simplified Chinese) \
 - EUC-JP, SHIFT_JIS, ISO-2022-JP (Japanese) \
 - EUC-KR, ISO-2022-KR (Korean) \
 - KOI8-R, MacCyrillic, IBM855, IBM866, ISO-8859-5, windows-1251 (Cyrillic) \
 - ISO-8859-2, windows-1250 (Hungarian) \
 - ISO-8859-5, windows-1251 (Bulgarian) \
 - windows-1252 (English) \
 - ISO-8859-7, windows-1253 (Greek) \
 - ISO-8859-8, windows-1255 (Visual and Logical Hebrew) \
 - TIS-620 (Thai) \
 \
Requires Python 2.1 or later \
 \
Command-line Tool \
----------------- \
 \
chardet comes with a command-line script which reports on the encodings of one \
or more files:: \
 \
    % chardetect.py somefile someotherfile \
    somefile: windows-1252 with confidence 0.5 \
    someotherfile: ascii with confidence 1.0"
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "python311-chardet-5.1.0-3.1.noarch.rpm"
RPM_HASH = "c3ba874c9eb0db685f30a90b31fdcfa47995ad6bfeefe71f92f6493edc4329c0b659798e3cfe726a47d0cdd33053f7e8c618481ce74301ce2eb61e1e822d844a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(chardet) python311-chardet python3dist(chardet)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi)"

inherit rpm
