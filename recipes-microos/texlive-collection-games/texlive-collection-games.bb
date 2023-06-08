SUMMARY = "Games typesetting"
DESCRIPTION = "Setups for typesetting various games, including chess."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65631"

RPM_NAME = "texlive-collection-games-2023.201.svn65631-56.1.noarch.rpm"
RPM_HASH = "d527d35e2c0c974ebd77c79cac554f3374e25bf5c33d1db549c4e61f46dec13b4b047be00ce15c8cefaf3f18c0224a9eedc456ec34e95f1f33538127ecd399ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-games"
RDEPENDS:${PN} += "texlive-bartel-chess-fonts texlive-chess texlive-chess-problem-diagrams texlive-chessboard texlive-chessfss texlive-chinesechess texlive-collection-latex texlive-crossword texlive-crosswrd texlive-customdice texlive-egameps texlive-gamebook texlive-gamebooklib texlive-go texlive-hanoi texlive-havannah texlive-hexboard texlive-hexgame texlive-hmtrump texlive-horoscop texlive-jeuxcartes texlive-jigsaw texlive-labyrinth texlive-logicpuzzle texlive-mahjong texlive-maze texlive-musikui texlive-nimsticks texlive-onedown texlive-othello texlive-othelloboard texlive-pas-crosswords texlive-psgo texlive-realtranspose texlive-reverxii texlive-rubik texlive-schwalbe-chess texlive-scrabble texlive-sgame texlive-skak texlive-skaknew texlive-soup texlive-sudoku texlive-sudokubundle texlive-tangramtikz texlive-wargame texlive-xq texlive-xskak"

inherit rpm
