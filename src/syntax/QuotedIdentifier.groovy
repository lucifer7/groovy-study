package syntax

/**
 * Usage: <b> Groovy syntax </b>
 * An OOP, dynamic, weekly-typed, scripting language
 * No main() entrance
 * No semicolon
 *
 * @author lucifer
 * Date 2018-1-24
 * Device Aurora R5
 */
// def(object) / type(concrete type)
def map = [:]

map.normal = "normal identifier"
map."space double quotes" = "ok with space"
map.'space single quotes' = "ok with double or single"
map.'single-dash' = "ok with dash"

map.'''triple single''' = "ok with triple single quotes"
map."""triple double""" = "ok with triple double quotes"

map./escape \// = "ok with slash"
map.$/dollar $$/$ = "ok with dollar slash"
map.$/ /$ = "ok with space"

print map