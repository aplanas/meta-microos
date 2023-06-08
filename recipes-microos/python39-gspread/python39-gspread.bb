SUMMARY = "Google Spreadsheets Python API"
DESCRIPTION = "A Python module to access Google Spreadsheets. \
 \
Features \
-------- \
 \
* Google Sheets API v4. \
* Open a spreadsheet by its *title*, *url* or *key*. \
* Select cells by labels, e.g. 'A1'. \
* Extract range, entire row or column values. \
* Python 3 support."
LICENSE = "MIT"

PV = "5.7.2"

RPM_NAME = "python39-gspread-5.7.2-1.4.noarch.rpm"
RPM_HASH = "13733fda191165cc29ba4430c758b06d9128c018e8e3621a5d5c002baf9d263617219da335398cb6fe8ea4e213829cff41aeba49092920f0853cf661fc5dab7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gspread) python39-gspread python3dist(gspread)"
RDEPENDS:${PN} += "python(abi) python39-google-auth python39-google-auth-oauthlib"

inherit rpm
