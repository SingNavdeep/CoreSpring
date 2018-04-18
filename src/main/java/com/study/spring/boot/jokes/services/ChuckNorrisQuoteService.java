package com.study.spring.boot.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import org.springframework.stereotype.Service;

/**
 * A service class that returns a random chuck norris quote
 * @author Navdeep
 *
 */
@Service
public class ChuckNorrisQuoteService implements QuoteService
{
	@Override
	public String getQuote()
	{
		ChuckNorrisQuotes ckq = new ChuckNorrisQuotes();
		return ckq.getRandomQuote();
	}
}
